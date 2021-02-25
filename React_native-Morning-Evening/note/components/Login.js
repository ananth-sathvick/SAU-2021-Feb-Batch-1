import React, { useEffect, useState } from "react";
import { Text,TextInput,StyleSheet,View,AsyncStorage, Button } from "react-native";

const Login = ({navigation}) => {
    const [userName,setUserName] = useState("");
    const [error,setError] = useState("");

    useEffect(()=>{
        isAuth()
    },[])

    const isAuth = async () => {
        // await AsyncStorage.clear()
        const username = await AsyncStorage.getItem("username");
        console.log(username);
        if(username){
            navigation.navigate("All Notes");
        }
    }

    const logged = () => {
        if(!userName){
            setError("Please enter a valid username");
            return;
        }
        setError("");
        AsyncStorage.setItem("username",userName);
        navigation.navigate("All Notes");
        console.log(userName);
    }

    return (
        <View style={styles.container}>
            <Text style={styles.loginTextStyle}>
                Login
            </Text>
            <TextInput placeholder="Enter Username" onChangeText={ (text) => setUserName(text)} style={styles.textInputStyle} />
            <Text style={styles.error}>{error}</Text>
            <Button title="Login" onPress={logged} />
        </View>  
    )

}

const styles = StyleSheet.create({
    container: {
        justifyContent: "center",
        alignItems: "center",
        flex: 1
    },
    loginTextStyle: {
        fontSize: 25,
        fontWeight: "700",
        marginVertical: 20
    },
    textInputStyle: {
        borderColor: "blue",
        borderWidth: 1,
        borderRadius: 5,
        fontSize: 20,
        padding: 5,
        width: "60%",
        textAlign:"center"
    },
    error:
    {
        color:"red",
        marginBottom: 20,

    }
})

export default Login;