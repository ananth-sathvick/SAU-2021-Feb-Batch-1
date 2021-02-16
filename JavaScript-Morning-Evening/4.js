function array_manipulate(arr) {
    arr = arr.sort();
    console.log("Array after sorting = " + arr)
    arr = arr.map(element => element * 10);
    console.log("Array after *10 = " + arr)
    arr = arr.filter((element) => element % 3 == 0);
    return arr;
}
console.log(array_manipulate([6, 5, 4, 3, 2, 1]));