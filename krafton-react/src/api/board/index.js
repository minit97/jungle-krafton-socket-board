import axios from "axios";

export const API_BASE_URL = process.env.REACT_APP_API_URL;

export const board_write = (email, password) => {
    axios({
        method:"POST",
        url: `${API_BASE_URL}/api/board`,
        data:{
            "email": email.value,
            "password": password.value
        }
    }).then((res)=>{
        console.log(res);
    }).catch(error=>{
        console.log(error);
        throw new Error(error);
    });
}

export const board_list = (email, password) => {
    axios({
        method:"GET",
        url: `${API_BASE_URL}/boards`,
    }).then((res)=>{
        console.log(res);
    }).catch(error=>{
        console.log(error);
        throw new Error(error);
    });
}

export const board_detail = (email, password) => {
    axios({
        method:"GET",
        url: `${API_BASE_URL}/board/{boardId}`,
    }).then((res)=>{
        console.log(res);
    }).catch(error=>{
        console.log(error);
        throw new Error(error);
    });
}

export const board_update = (email, password) => {
    axios({
        method:"PATCH",
        url: `${API_BASE_URL}/board/{boardId}`,
    }).then((res)=>{
        console.log(res);
    }).catch(error=>{
        console.log(error);
        throw new Error(error);
    });
}

export const board_delete = (email, password) => {
    axios({
        method:"DELETE",
        url: `${API_BASE_URL}/board/{boardId}`,
    }).then((res)=>{
        console.log(res);
    }).catch(error=>{
        console.log(error);
        throw new Error(error);
    });
}

export const file_upload = async (file) => {
    try {
        const formData = new FormData();
        formData.append('file', file); // 'file'은 서버에서 기대하는z 파일 필드 이름

        const response = await axios.post(`${API_BASE_URL}/api/s3/resource`, formData, {
            headers: {
                'Content-Type': 'multipart/form-data'
            }
        });

        return response.data;
    } catch (error) {
        console.error('Error uploading file:', error);
    }
}