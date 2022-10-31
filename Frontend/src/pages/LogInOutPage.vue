<template>
    <Header></Header>
    <GeneralTitle text="Login"></GeneralTitle>
    <GeneralInput></GeneralInput>
    <GeneralInput></GeneralInput>
    <GeneralButton name="Login"></GeneralButton>
    <Footer></Footer>
</template>

<script>
import Header from '@/components/Header.vue';
import Footer from '@/components/Footer.vue';
import GeneralTitle from '@/components/GeneralTitle.vue';
import GeneralButton from '@/components/GeneralButton.vue';
import GeneralInput from '@/components/GeneralInput.vue';
export default {
    name:"HomePageVue",
    components: {
    Header,
    Footer,
    GeneralText,
    GeneralTitle,
    GeneralButton,
    GeneralInput
}
};
</script>

<style>

</style>