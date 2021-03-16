quantity = gets()
quantity = quantity.to_i
i = 2
i = i.to_i
fibonachi_array = Array[quantity+1]
fibonachi_array[0] = 0
fibonachi_array[1] = 1
result = "" + fibonachi_array[1].to_s
while (i<=quantity)
	fibonachi_array[i] = fibonachi_array[i-1] + fibonachi_array[i-2]
	result = result + fibonachi_array[i].to_s
	i = i + 1
end
puts(result);