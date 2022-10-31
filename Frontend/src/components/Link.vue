<template>
    <a href="{{href}}">{{name}}</a>
</template>

<script>
export default {
  name: 'Link',
  props: {
    name: String,
    href: String
  }
}
</script>

<style scoped>

</style>