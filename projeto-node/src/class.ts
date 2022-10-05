interface Pingable{
    ping(): void;
}

class Point implements Pingable{
    private _X: number = 0;
    private Y: number = 0;
    readonly name: String = "This point" //somente leitura

    constructor(otherName?: String) {
        if(otherName !== undefined){
            this.name = otherName;
        }
    }

    static jump(){
        console.log('jump')}
        ;

    ping(): void {
        console.log("ping point")
    }

    printPoint = () => {
        return `X: ${this._X}, Y: ${this.Y}`
    }

    get X():number {
        return this._X
    }

    set X(val: number) {
        this._X = val;
    }
}

class DPoint extends Point {
    Z: number = 0;

    printPoint = () =>  super.printPoint() + `, Z: ${this.Z}`
}

type TPoint = {
    X: number,
    Y: number
}

let p = new Point("Aqui eu posso passar um novo nome, no construtor");
p.X = 12;
//p.Y = 6;
//p.name = "Nao vai deixar sobreescrever"
console.log(p.printPoint());

























Point.jump();

//---------------------------------------------------------------
class Caixa <T> {
    _contents: T[] = [];

    addItem = (item: T) => this._contents.push(item)

    removeLastItem = () => this._contents.pop

    get contents(){
        return this._contents;
    }

    set contets(val: T[]){
        this._contents = val
    }
}