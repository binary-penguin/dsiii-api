<template>
  <v-app-bar color="#77411d" dense dark app>
    <v-app-bar-nav-icon @click="$emit('toggleEvent')"></v-app-bar-nav-icon>

    <v-toolbar-title>Dark Souls III Archive</v-toolbar-title>

    <v-spacer></v-spacer>
    <v-btn icon>
      <v-icon>mdi-home</v-icon>
    </v-btn>
    <v-btn icon>
      <v-icon>mdi-information-outline</v-icon>
    </v-btn>
  </v-app-bar>
</template>

<script>
export default {
  name: 'NavigationBar',

  methods: {
    toggleDrawer() {
      this.isOpen = !this.isOpen
    },
  },
}
</script>
