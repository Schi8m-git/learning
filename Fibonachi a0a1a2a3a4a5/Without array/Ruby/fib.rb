quantity=gets()
quantity=quantity.to_i
previous=0
current=1
sum=0
i=1
i=i.to_i
result_string=""+current.to_s
while (i<quantity)
	sum=current
	current=current+previous
	previous=sum
	i=i+1
	result_string=result_string+current.to_s
end
puts(result_string)

