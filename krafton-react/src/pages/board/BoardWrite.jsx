import React, {useState} from "react";
import ReactDOM from "react-dom";
import Button from "@mui/material/Button";
import { MuiFileInput } from "mui-file-input";
import { Controller, useForm } from "react-hook-form";
import {file_upload} from "../../api/board";

const BoardWrite = () => {
    const { control, handleSubmit } = useForm({
        defaultValues: {
            file: undefined
        }
    });
    const [img, setImg] = useState("");

    const onSubmit = async (data) => {
        const response = await file_upload(data.file);
        setImg(response.path);
    };

    return (
        <>
            {img !== "" && <img src={img} alt="Image"/>}
            <form onSubmit={handleSubmit(onSubmit)}>
                <Controller
                    name="file"
                    control={control}
                    render={({ field, fieldState }) => (
                        <MuiFileInput
                            {...field}
                            helperText={fieldState.invalid ? "File is invalid" : ""}
                            error={fieldState.invalid}
                        />
                    )}
                />
                <div>
                    <Button type="submit" variant="contained" sx={{ mt: 2 }}>
                        Submit
                    </Button>
                </div>
            </form>
        </>
    )
}

export default BoardWrite;