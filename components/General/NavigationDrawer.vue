<template>
  <v-navigation-drawer app :value="isOpen">
    <v-list-item>
      <v-list-item-content>
        <v-list-item-title class="text-h6"> Menu </v-list-item-title>
        <v-list-item-subtitle>
          Explore the World of Dark Souls 3!
        </v-list-item-subtitle>
      </v-list-item-content>
    </v-list-item>

    <v-divider></v-divider>

    <v-list dense nav>
      <v-list-item v-for="item in items" :key="item.title" link>
        <v-list-item-icon>
          <v-icon>{{ item.icon }}</v-icon>
        </v-list-item-icon>

        <v-list-item-content>
          <v-list-item-title>{{ item.title }}</v-list-item-title>
        </v-list-item-content>
      </v-list-item>
    </v-list>
  </v-navigation-drawer>
</template>

<script>
export default {
  props: {
    isOpen: Boolean,
  },
  data() {
    return {
      items: [
        { title: 'Dark Souls III', icon: 'mdi-sword' },
        { title: 'Bosses', icon: 'mdi-robot-angry' },
        { title: 'Locations', icon: 'mdi-map-outline' },
      ],
      right: null,
    }
  },
}
</script>
