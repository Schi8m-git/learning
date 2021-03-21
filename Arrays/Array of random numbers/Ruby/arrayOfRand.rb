arrayLength = gets()
arrayLength = arrayLength.to_i
i = 0;
arrayOfRand = Array.new(arrayLength)
while(i<arrayLength)
	resultNumber = i * rand(100)
	resultNumber = resultNumber.to_i
	arrayOfRand[i] = resultNumber
	i+=1
end
puts(arrayOfRand);