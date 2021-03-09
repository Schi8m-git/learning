puts ("Введие первое слагаемое:")
a = gets.chomp()
puts("Первое слагаемое: " + a)
puts ("Введите второе слагаемое:")
b = gets.chomp()
puts("Второе слагаемое: " + b)
c = a.to_i + b.to_i
print ("Сумма = " + c.to_s)
do_not_close_the_window = gets