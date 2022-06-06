<template>
  <v-app dark>
    <NavigationBar @toggleEvent="toggle"></NavigationBar>
    <NavigationDrawer :isOpen="open"></NavigationDrawer>
    <Nuxt />
  </v-app>
</template>

<script>
import NavigationBar from '~/components/General/NavigationBar.vue'
import NavigationDrawer from '~/components/General/NavigationDrawer.vue'
export default {
  components: { NavigationBar, NavigationDrawer },
  data() {
    return {
      open: false,
    }
  },
  methods: {
    toggle() {
      this.open = !this.open
    },
  },
}
</script>
