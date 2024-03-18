import React, { useEffect, useState } from 'react';
import { listesEmployes } from '../services/EmployeService';

function ListesEmployes() {
    const [employes, setEmployes] = useState([]);

    useEffect(() => {
        listesEmployes().then((response) => {
            setEmployes(response.data);
        }).catch(error => {
            console.error(error);
        });
    });

   

    return (
        <div className='container'>
            <h2 className='text-center'>Listes des employés</h2>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                        <th>Identifiant Employé</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    {employes.map(employe =>
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
    );
}

export default ListesEmployes;
