<template>
    <ProjectHeader></ProjectHeader>
    <GeneralTitle text="Welcome to our Bugettracker Webapplication!!" h1="true"></GeneralTitle>
    <GeneralTitle text="Be the master of your finances with our tools for your needs." h2="true"></GeneralTitle>
    <GeneralText text="This is just some interresting text about the concept of this application and I hope you like it."></GeneralText>
    
    <ProjectFooter></ProjectFooter>
</template>

<script>
import ProjectHeader from '@/components/Header.vue';
import ProjectFooter from '@/components/Footer.vue';
import GeneralText from '@/components/GeneralText.vue';
import GeneralTitle from '@/components/GeneralTitle.vue';
export default {
    name:"HomePageVue",
    components: {
    ProjectHeader,
    ProjectFooter,
    GeneralText,
    GeneralTitle
    }
};
</script>

<style>

</style>