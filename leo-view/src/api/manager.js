import axios from '~/axios'

  export default  function login(form){
 return axios.post("/leo/add",form)
};

export   function add(params){
  return axios.post("/leo/add",params)
 }
 export   function selectAll(){
  return axios.post("/leo/selectlist")
 }