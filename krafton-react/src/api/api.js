import axios from 'axios';

export const API_BASE_URL = process.env.REACT_APP_API_URL;

const test_api = () => {
    console.log("박현민 : ", API_BASE_URL);
    axios.get(`${API_BASE_URL}/test`).then((response)=>{
        console.log(response.data);
    }).catch((Error)=>{
        console.log(Error);
    })
}