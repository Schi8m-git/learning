puts ("Введите число")
a = gets
a = a.to_i
i = 0
if a > 0
	k = 1
else
	k = -1
end
puts i
until i == a do
	i = i + k
	puts (i) 
end
