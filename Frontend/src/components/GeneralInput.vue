<template>
  <label for="{{inputId}}">{{inputLable}}</label>
  <input type="{{inputType}}" id="{{inputId}}">
</template>

<script>
export default {
  name: 'GeneralInput',
  props: {
    inputLable: String,
    required: true,
    inputId: String,
    required: true,
    inputType: String,
    required: true
  }
}
</script>

<style scoped>

</style>