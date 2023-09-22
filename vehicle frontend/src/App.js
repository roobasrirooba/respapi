import React from "react";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'; // Import Router and Routes

import Login from "./components/Login";
import AdminLogin from "./components/AdminLogin";
import Booking from "./components/Booking";
import Dashboard from "./components/Dashboard";
import SignIn from "./components/SignIn";
import EmployeeLogin from "./components/EmployeeLogin";
import UserLogin from "./components/UserLogin";
import History from "./components/History";

function App() {
  return (
    <div>
      <Router>
        <Routes>
          
          <Route path="/" element={<Dashboard />} />
          <Route path="/login" element={<Login />} />
          <Route path="/adminlogin" element={<AdminLogin />} />
          <Route path="/employeelogin" element={<EmployeeLogin />} />
          <Route path="/userlogin" element={<UserLogin />} />
          <Route path='/booking' element={<Booking />} />
          <Route path='/landingpage' element={<SignIn/>} />
          <Route path="/history" element={<History />} />

        </Routes>
      </Router>
    </div>
  );
}

export default App;