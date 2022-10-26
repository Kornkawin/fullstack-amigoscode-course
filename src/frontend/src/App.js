import {
    Button,
    Radio
} from "antd";
import React, { useState, useEffect } from 'react';
import './App.css';

import { getAllStudents } from "./client";

function App() {
    getAllStudents().then(console.log);

    return (
        <div className="App">
            <Button type='primary'>Hello</Button>
            <br/>
            <Radio.Group value='Large'>
                <Radio.Button value="large">Large</Radio.Button>
                <Radio.Button value="default">Default</Radio.Button>
                <Radio.Button value="small">Small</Radio.Button>
            </Radio.Group>
        </div>
    );
}

export default App;
