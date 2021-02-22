import logo, { ReactComponent } from './logo.svg';
import './App.css';
import React from 'react';
import Victor from "./images/image-victor.jpg";
import Fathima from "./images/Tammy.PNG";



class App extends React.Component{
render(){
    return (
    <div className="App">
      <div className="container">
        <div className="card-header">
          <div className="image">
            <img src={Fathima} className="img"></img>
        </div>
        </div>
        <div className="name">
          <h1>Tamziya Fathima</h1>
          <span className="age">26</span>
          <h2 className="city">St. Louis</h2>
        </div>
        
        <div class="card-footer">
      <div class="item">
        <h4 class="value">80K</h4>
        <h5 class="meta">Followers</h5>
      </div>
      <div class="item">
        <h4 class="value">803K</h4>
        <h5 class="meta">Likes</h5>
      </div>
      <div class="item">
        <h4 class="value">1.4K</h4>
        <h5 class="meta">Photos</h5>
      </div>
        </div>
     </div>
     </div>
     
  );
}
}

export default App;
