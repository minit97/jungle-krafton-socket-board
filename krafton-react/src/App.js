import {Route, Routes} from 'react-router-dom';

import Home from './pages/Home'
import SignIn from './pages/auth/SignIn'
import SignUp from './pages/auth/SignUp'
import Board from './pages/board/Board'
import BoardWrite from "./pages/board/BoardWrite";

function App() {
  return (
      <Routes>
          <Route path="/" element={<Home />}/>
          <Route path="/login" element={<SignIn />}/>
          <Route path="/join" element={<SignUp />}/>
          <Route path="/board" element={<Board />} />
          <Route path="/board/write" element={<BoardWrite />} />
      </Routes>
  );
}

export default App;
