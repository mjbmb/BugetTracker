<template>
  <div class="container text-center font-weight-normal spacing"><p>{{text}}</p></div>
</template>

<script>
export default {
  name: 'GeneralText',
  props: {
    text: {type: String,
    required: true}
  }
}
</script>

<style scoped>
  .spacing{
    margin-top: 30px;
    margin-bottom: 15px;
  }
</style>