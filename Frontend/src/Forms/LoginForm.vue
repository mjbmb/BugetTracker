<template>
    <form @submit="getUser" method="get">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" class="form-control" id="username" v-model="name">
        </div>
        <div class="form-group">
            <label for="userpassword">Password</label>
            <input type="password" class="form-control" id="userpassword" v-model="password">
        </div>
    </form>
</template>
  
<script>
import axios from "axios";
  export default {
    name: 'LoginForm',
    data() {
        return {
            name: "",
            password: "",
        }
    },
    methods: {
        getUser() {
            axios.get()
        }
    }
}
</script>
  
<style scoped>

</style>