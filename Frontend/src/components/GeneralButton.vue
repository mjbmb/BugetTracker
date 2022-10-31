<template>
  <button type="button" class="btn btn-outline-dark" v-bind="$attrs">{{name}}</button>
</template>

<script>
export default {
  name: 'GeneralButton',
  props: {
    name: {type:String,
    default: "lable",
    required: true}
  }
}
</script>

<style scoped>

</style>