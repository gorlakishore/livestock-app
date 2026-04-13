import React, { useEffect, useState } from "react";

function App() {
  const [data, setData] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/livestock")
      .then(res => res.json())
      .then(setData);
  }, []);

  return (
    <div>
      <h1>Livestock App</h1>
      {data.map((item, i) => (
        <p key={i}>{item}</p>
      ))}
    </div>
  );
}

export default App;
