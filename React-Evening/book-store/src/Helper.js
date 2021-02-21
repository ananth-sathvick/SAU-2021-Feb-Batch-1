function findWithAttr(array, attr, value) {
    for(var i = 0; i < array.length; i += 1) {
        if(array[i][attr] == value) {
            return array[i];
        }
    }
    return -1;
}

export function findWithAttrs(array, attr, value) {
    let arr = [];
    if(value == ""){
        return array;
    }
    for(var i = 0; i < array.length; i += 1) {
        if(array[i][attr] == value) {
            arr.push(array[i]);
        }
    }
    return arr;
}

export default findWithAttr;