<template>
    <!--inspiered by https://getbootstrap.com/docs/5.2/examples/headers/-->
    <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
      <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
        <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
      </a>

      <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0" v-for="link in links" :key="link.id">
        <li href="{{link.href}}">{{link.name}}</li>
      </ul>

      <div class="col-md-3 text-end" v-for="button in buttons" :key="button.id">
        <button type="button" class="btn btn-outline-primary me-2">{{button.title}}</button>
        <GeneralButton name="Login" @click="LogInOut"></GeneralButton>
      </div>
    </header>
</template>

<script>
import GeneralButton from './GeneralButton.vue';
export default {
  name: 'ProjectHeader',
  components:{
    GeneralButton
    },
  props: {
    links: [
        { id: 1, name: 'My journey with Vue', href: "" },
        { id: 2, name: 'Blogging with Vue', href: "" },
        { id: 3, name: 'Why Vue is so fun', href: "" }
      ],
  },
  created: function() {
    this.setup();
  },
  methods: {
    setup: function(){

    },
    LogInOut: function(){
        if(sessionStorage.getItem("username") != null){
            window.location.replace("url of the website/document");
            return;
        }return;
        /*$.ajax({
            type: "get",
            url: "users/id",
            data: "data",
            dataType: "JSON",
            success: function (response) {
                
            }
        });*/
    }
  }
}
</script>

<style scoped>

</style>