quantity=gets()
quantity=quantity.to_i
previous=0
current=1
sum=0
i=0
i=i.to_i
result_string=""+current.to_s
while (i<quantity)
	sum=current
	current=current+previous
	previous=sum
	i=i+1
	if ((i/2)*2==i)
		result_string=current.to_s+result_string
	else
		result_string=result_string+current.to_s
	end
end
puts(result_string)

