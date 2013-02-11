def circle(angle : Int = 360, isRight : Boolean = true, size : Int = 2){
    repeat(angle){
        forward(size)
        if(isRight) right(1) else left(1)
    }
}

clear()
//invisible()
setAnimationDelay(100)
setPenColor(black)

left(90)
setFillColor(gray)
circle(180)

right(90)
forward(228) // 計算式不明

left(90)
setFillColor(white)
circle(180, false)

penUp()
left(90)
forward(60)
right(90)
penDown()
forward(30)
circle(15, false)
circle(75, false, 1)
left(90)
circle(90, false, 1)
right(90)
forward(30)

