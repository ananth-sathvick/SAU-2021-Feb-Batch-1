function check(s) {
    lion = new RegExp(/^lion/i);
    cat = new RegExp(/cat$/i);
    abc = new RegExp(/a.*b+.*c/);

    if (lion.test(s) || cat.test(s) || abc.test(s)) {
        if (abc.test(s)) {
            var arr = ['a', 'b', 'c'];
            arr.forEach((element) => {
                console.log("indices of " + element);
                var indices = [];
                var regex = new RegExp(element, "gi");
                while ((result = regex.exec(s))) {
                    indices.push(result.index);
                }
                console.log(indices);
            });

        }
        return true;
    } else {
        return false;
    }
}

console.log(check("lioz car barcelona"));
console.log(check("lion czr brcelon"));
console.log(check("lioz car arelona cat"));
console.log(check("lioz car arelona"));