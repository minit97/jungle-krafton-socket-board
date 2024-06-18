import axios from "axios";

export const API_BASE_URL = process.env.REACT_APP_API_URL;

export const signup = (email, password) => {
    axios({
        method:"POST",
        url: `${API_BASE_URL}/api/signup`,
        data:{
            "email": email.value,
            "password": password.value
        }
    }).then((res)=>{
        console.log(res);

        return true;
    }).catch(error=>{
        console.log(error);
        throw new Error(error);
    });
}

export const signin = (email, password) => {
    axios({
        method:"POST",
        url: `${API_BASE_URL}/login`,
        data:{
            "email": email.value,
            "password": password.value
        }
    }).then((res)=>{
        console.log(res);


        return true;
    }).catch(error=>{
        console.log(error);
        throw new Error(error);
    });
}