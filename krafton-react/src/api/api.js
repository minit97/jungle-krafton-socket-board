import axios from 'axios';

export const API_BASE_URL = process.env.REACT_APP_API_URL;

export const test_api = () => {
    console.log("박현민 : ", API_BASE_URL);
    axios.get(`${API_BASE_URL}/api/s3/test`).then((response)=>{
        console.log(response.data);
    }).catch((Error)=>{
        console.log(Error);
    })
}


// export const test_api2 = async (email, password) => {
//     try {
//         const res = await axios({
//             method: "POST",
//             url: `${API_BASE_URL}/api/signup`,
//             data: {
//                 email,
//                 password
//             }
//         });
//         console.log(res);
//         return res;
//     } catch (error) {
//         console.error(error);
//         throw new Error(error);
//     }
// };