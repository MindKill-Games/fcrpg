;Set graphics mode, play a pretty jingle and put an image on the screen

Graphics 800,600,32,2 

SetBuffer BackBuffer()

Global TitleTimer=CreateTimer(512)

Global TitleImage=LoadImage("mindkill.bmp")

;Global TitleSound=LoadSound("jingle.wav")

While Not KeyHit(28)

	DrawImage(TitleImage,130,130)
	
	;PlaySound(TitleSound)

	Flip

	Cls 
	
Wend

;Goto gamemenu