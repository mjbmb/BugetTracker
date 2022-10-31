<template>
  <h1 v-if="h1">{{text}}</h1>
  <h2 v-if="h2">{{text}}</h2>
  <h3 v-if="h3">{{text}}</h3>
  <h4 v-if="h4">{{text}}</h4>
</template>

<script>
export default {
  name: 'GeneralTitle',
  props: {
    h1: {type: Boolean,
    default: false},
    h2: {type: Boolean,
    default: false},
    h3: {type: Boolean,
    default: false},
    h4: {type: Boolean,
    default: false},
    text: {type: String,
    required: true}
  }
}
</script>

<style scoped>

</style>