//let a = prompt('Введите первое слагаемое')
//let b = prompt('Введите второе слагаемое')
//a = Number.parseInt(a)
//b = Number.parseInt(b)
//c= a + b
//alert(a + ' + ' + b + ' = ' + c)

//doNOTcloseTHEwindow = prompt('Не вводи число')


let age
const a = prompt('Сколько Вам лет?')
if (a > 18) {
	age = true
}
else {
	age = false
}
age ? alert('Заходи, бритшка') : alert('Топай в школу')