type Box<type = any> = {
    contents? : type[],
    contentLength?: () => number; 
}

let box: Box<String>= {
    contents: [],
    contentLength: () => box.contents?.length ?? 0
};

box.contents?.push("conteudo");

let box2: Box<Number> = {contents:[]};

box2.contents?.push(12);

let box3: Box = {contents:[]};

box3.contents?.push("teste");
box3.contents?.push(1);

function a<t> (arg: t):t{
    return arg;
};

let n: string = a("123");

//-----------------------------------

type User = {
    name: string,
    age: number,
    occupation: string
}

const users: User[] = [
    {
        name: "max",
        age: 25,
        occupation: "Student"
    },
    {
        name:"Kate",
        age: 24,
        occupation: "Student"
    } 
];

function logPerson(user: User){
    console.log( ` - ${user.name}, ${user.age}`);
}

console.log("Users:")