import axios from '~/axios'

  export default  function login(name,age){
 return axios.post("/leo/add",{
    name,
    age
})
}