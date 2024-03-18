import React from 'react'


function ListesEmployes() {
   const data = [
  {
    id: 1,
    nom: "David",
    prenom: "Marque",
    email: "test@gmail.com"
  },
  {
    id: 2,
    nom: "Alice",
    prenom: "Johnson",
    email: "alice.johnson@example.com"
  },
  {
    id: 3,
    nom: "John",
    prenom: "Doe",
    email: "john.doe@example.com"
  },
  {
    id: 4,
    nom: "Emma",
    prenom: "Smith",
    email: "emma.smith@example.com"
  }
];


  return (
    
    <div className='container'>
            <h2 className='text-center'>Listes des employés</h2>

        <table className='table table-striped table-bordered'>
  <thead>
    <tr >
      <th >Employe Id</th>
      <th >Nom</th>
      <th >Prenom</th>
      <th>email</th>
    </tr>
  </thead>
  <tbody>

    {data.map(employe=>
      <tr key={employe.id}>
        <td>{employe.id}</td>
       <td>{employe.nom}</td>
           <td>{employe.prenom}</td>
               <td>{employe.email}</td>
    </tr>
    )}

  
  
  </tbody>
</table>


     </div>

  )
}

export default ListesEmployes