import React from 'react';

function App() {
  // List of office spaces as objects
  const officeSpaces = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai',
      image: 'https://images.unsplash.com/photo-1515378791036-0648a3ef77b2'
    },
    {
      name: 'WeWork',
      rent: 65000,
      address: 'Bangalore',
      image: 'https://images.unsplash.com/photo-1482062364825-616fd23b8fc1'
    },
    {
      name: 'Regus',
      rent: 55000,
      address: 'Hyderabad',
      image: 'https://images.unsplash.com/photo-1464983953574-0892a716854b'
    }
  ];

  // Main JSX
  return (
    <div style={{ margin: 40 }}>
      {/* Heading using JSX */}
      <h1>Office Space, at Affordable Range</h1>

      {/* Render list of office spaces */}
      {officeSpaces.map((item, idx) => (
        <div
          key={idx}
          style={{
            border: '1px solid #ccc',
            borderRadius: 8,
            padding: 20,
            margin: '24px 0',
            maxWidth: 500
          }}
        >
          {/* Image attribute in JSX */}
          <img
            src={item.image}
            alt="Office Space"
            width="300"
            height="180"
            style={{ display: 'block', marginBottom: 16, borderRadius: 8 }}
          />
          {/* Office details with expressions and conditional style */}
          <h2>Name: {item.name}</h2>
          <h3
            style={{
              color: item.rent <= 60000 ? 'red' : 'green',
              fontWeight: 'bold'
            }}
          >
            Rent: Rs. {item.rent}
          </h3>
          <h3>Address: {item.address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;
