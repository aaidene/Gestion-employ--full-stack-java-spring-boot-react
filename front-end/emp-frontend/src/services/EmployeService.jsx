import axios from "axios";

const REST_API_BASE_URL = 'http://localhost:8080/api/employes';

export const listesEmployes = () => axios.get(REST_API_BASE_URL);