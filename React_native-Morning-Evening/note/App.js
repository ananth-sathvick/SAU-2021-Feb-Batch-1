import React from "react";
import  { createStackNavigator} from "@react-navigation/stack";
import { NavigationContainer } from "@react-navigation/native";

import Login from "./components/Login";
import Allnotes from "./components/Allnotes";
import NoteDetails from "./components/NoteDetails";

const Stack = createStackNavigator();

const App = () => { 
  return (
    <NavigationContainer>
      <Stack.Navigator>
      <Stack.Screen name="Login" component={Login} />
      <Stack.Screen name="All Notes" component={Allnotes} />
      <Stack.Screen name="Note Details" component={NoteDetails} />
      </Stack.Navigator>
    </NavigationContainer>
  )
}
 
export default App;
