import ApiClient from "./ApiClient";

export const addService = (vehicle) => {
    return ApiClient.addService(process.env.REACT_APP_SERVICE_ADD_URL, vehicle);
}