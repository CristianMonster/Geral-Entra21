console.log("teste")

type Rect = {
    width?: number, //ponto de interrogação faz com o que a propriedade nao seja obrigatoria
    height?: number
};

type Triangle = {
    angle: number
    type: "isosceles" | "scalene" | "obtuse"
};

type Circle = {
    radius: number
}

type GerometricFigure = Rect | Triangle | Circle;

let c: GerometricFigure = {
    radius: 10
}

let rect: GerometricFigure = {
    height: 20,
    width: 30
};

let t: GerometricFigure = {
    angle: 45,
    type: "isosceles" 
};

let f = (x:any, y:number) : number => {
    return x+y;
}

let numeros:number;
numeros = f(2, 5);