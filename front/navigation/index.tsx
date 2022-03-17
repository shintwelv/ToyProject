/**
 * If you are not familiar with React Navigation, refer to the "Fundamentals" guide:
 * https://reactnavigation.org/docs/getting-started
 *
 */
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import {
  NavigationContainer,
  DefaultTheme,
  DarkTheme,
} from "@react-navigation/native";
import { createNativeStackNavigator } from "@react-navigation/native-stack";
import * as React from "react";
import { ColorSchemeName, Pressable } from "react-native";

import Colors from "../constants/Colors";
import useColorScheme from "../hooks/useColorScheme";
import ModalScreen from "../screens/ModalScreen";
import NotFoundScreen from "../screens/NotFoundScreen";
import TabFiveScreen from "../screens/TabFiveScreen";
import TabFourScreen from "../screens/TabFourScreen";
import TabOneScreen from "../screens/TabOneScreen";
import TabThreeScreen from "../screens/TabThreeScreen";
import TabTwoScreen from "../screens/TabTwoScreen";
import {
  RootStackParamList,
  RootTabParamList,
  RootTabScreenProps,
} from "../types";
import LinkingConfiguration from "./LinkingConfiguration";

import TabOneIcon from "../assets/images/svg/mail_tab.svg";
import TabTwoIcon from "../assets/images/svg/sheet_tab.svg";
import TabThreeIcon from "../assets/images/svg/apple_tab.svg";
import TabFourIcon from "../assets/images/svg/android_tab.svg";
import TabFiveIcon from "../assets/images/svg/human_tab.svg";

export default function Navigation({
  colorScheme,
}: {
  colorScheme: ColorSchemeName;
}) {
  return (
    <NavigationContainer linking={LinkingConfiguration} theme={DefaultTheme}>
      <RootNavigator />
    </NavigationContainer>
  );
}

/**
 * A root stack navigator is often used for displaying modals on top of all other content.
 * https://reactnavigation.org/docs/modal
 */
const Stack = createNativeStackNavigator<RootStackParamList>();

function RootNavigator() {
  return (
    <Stack.Navigator>
      <Stack.Screen
        name="Root"
        component={BottomTabNavigator}
        options={{ headerShown: false }}
      />
      <Stack.Screen
        name="NotFound"
        component={NotFoundScreen}
        options={{ title: "Oops!" }}
      />
      <Stack.Group screenOptions={{ presentation: "modal" }}>
        <Stack.Screen name="Modal" component={ModalScreen} />
      </Stack.Group>
    </Stack.Navigator>
  );
}

/**
 * A bottom tab navigator displays tab buttons on the bottom of the display to switch screens.
 * https://reactnavigation.org/docs/bottom-tab-navigator
 */
const BottomTab = createBottomTabNavigator<RootTabParamList>();

const tabIconColor = (focused: boolean) =>
  focused ? Colors.light.tabIconSelected : Colors.light.tabIconDefault;

function BottomTabNavigator() {
  const colorScheme = useColorScheme();

  return (
    <BottomTab.Navigator
      initialRouteName="TabOne"
      screenOptions={{
        tabBarActiveTintColor: "#c7a55f",
        tabBarShowLabel: false,
      }}
    >
      <BottomTab.Screen
        name="TabOne"
        component={TabOneScreen}
        options={({ navigation }: RootTabScreenProps<"TabOne">) => ({
          title: "Tab One",
          tabBarIcon: ({ color, focused }) => (
            <TabOneIcon width={24} height={24} fill={tabIconColor(focused)} />
          ),
        })}
      />
      <BottomTab.Screen
        name="TabTwo"
        component={TabTwoScreen}
        options={{
          title: "Tab Two",
          tabBarIcon: ({ color, focused }) => (
            <TabTwoIcon width={24} height={24} fill={tabIconColor(focused)} />
          ),
        }}
      />
      <BottomTab.Screen
        name="TabThree"
        component={TabThreeScreen}
        options={{
          title: "Tab Three",
          tabBarIcon: ({ color, focused }) => (
            <TabThreeIcon width={24} height={24} fill={tabIconColor(focused)} />
          ),
        }}
      />
      <BottomTab.Screen
        name="TabFour"
        component={TabFourScreen}
        options={{
          title: "Tab Four",
          tabBarIcon: ({ color, focused }) => (
            <TabFourIcon width={24} height={24} fill={tabIconColor(focused)} />
          ),
        }}
      />
      <BottomTab.Screen
        name="TabFive"
        component={TabFiveScreen}
        options={{
          title: "Tab Five",
          tabBarIcon: ({ color, focused }) => (
            <TabFiveIcon width={24} height={24} fill={tabIconColor(focused)} />
          ),
        }}
      />
    </BottomTab.Navigator>
  );
}
