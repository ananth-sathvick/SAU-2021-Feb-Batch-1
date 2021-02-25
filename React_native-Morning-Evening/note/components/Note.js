import React from "react";
import { ImageBackground, View, StyleSheet, Text, TouchableTouchableNativeFeedback, Button } from "react-native";
import { ScrollView, TouchableNativeFeedback } from "react-native-gesture-handler";

const Note = ({ update, data, navigation, id ,del}) => {
    // console.log(id);
    const remove = () => {
        del(id);
    };
    
    return (
        <View style={styles.container}>
            <ImageBackground style={styles.backgroundImage} imageStyle={{ borderRadius: 10 }}>
        <TouchableNativeFeedback
            onPress={() =>
                navigation.navigate("Note Details", { data: data, update: update, id: id })
            }
        >
                    <Text style={styles.title}>{data.title}</Text>
                    <ScrollView onStartShouldSetResponder={() => true}>

                            <Text style={styles.source}>{data.desc}</Text>
                    </ScrollView>
        </TouchableNativeFeedback>
                    <View style={styles.delete}>
                        <Button title="Delete" color="red" onPress={remove} />
                    </View>
                </ImageBackground>
            </View>
    )
}

const styles = StyleSheet.create({
    title: {
        fontSize: 20,
        color: "black",
        fontWeight: "bold",
        padding: 5,
        borderBottomColor: 'black',
        borderBottomWidth: 2,
    },
    source: {
        fontSize: 16,
        color: "black",
        fontWeight: "500",
        padding: 5,
        height:100
        // flexShrink: 1,

    },
    backgroundImage: {
        width: "100%",
        height: "100%",

    },
    container: {
        width: "90%",
        marginRight: "5%",
        marginLeft: "5%",
        height: 190,
        // marginVertical: 8,
        backgroundColor: "#ffd300",
        borderRadius: 10,
        marginBottom:"7%"
    },
    delete:
    {
        width:"25%",
        alignSelf:"flex-end",
        margin:5,
        flexWrap:"wrap-reverse",


    }
})

export default Note;