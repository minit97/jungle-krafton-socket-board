import {Route, Routes} from 'react-router-dom';

import Home from './pages/Home'
import SignIn from './pages/SignIn'
import SignUp from './pages/SignUp'
import Board from './pages/Board'

function App() {
  return (
      <Routes>
          <Route path="/" element={<Home />}/>
          <Route path="/login" element={<SignIn />}/>
          <Route path="/join" element={<SignUp />}/>
          <Route path="/board" element={<Board />} />
      </Routes>
  );
}

export default App;
