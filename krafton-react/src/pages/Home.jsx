import React, {useEffect} from 'react';
import {test_api} from '../api/api';

const Home = () => {
    useEffect(() => {
        test_api();
    }, [])


    return (
        <div>
            HOME
        </div>
    )
}

export default Home;