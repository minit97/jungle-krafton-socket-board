import axios from "axios";

export const API_BASE_URL = process.env.REACT_APP_API_URL;

export const signup = async (email, password, name) => {
    try {
        const res = await axios({
            method:"POST",
            url: `${API_BASE_URL}/api/signup`,
            data:{
                "username": email,
                "password": password,
                "nickname": name
            }
        });
        console.log(res);
        return res;

    } catch (error) {
        console.error(error);
        throw new Error(error);
    }
}

export const signin = async (email, password) => {
    try {
        const res = await axios({
            method:"POST",
            url: `${API_BASE_URL}/api/signup`,
            data:{
                "username": email,
                "password": password,
            }
        });

        console.log(res);
        return res;
    } catch (error) {
        console.error(error);
        throw new Error(error);
    }
}