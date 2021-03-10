x1=gets
x2=gets
x1=x1.to_f
x2=x2.to_f
d=x2-x1
dx=d/100
x=x1
max=(6*x1+6)*dx
until (x>=x2)
	dy1=(6*x+6)*dx
	x=x+dx
	dy2=(6*x+6)*dx
	delt=dy2-dy1
	if (delt>max)
		max=delt
	end
end
puts(max)