;Skills

Global strength=0,speech=0,barter=0,investigation=0,intelligence=0

Dim skillnames$(4)

	skillnames$(0) = "Strength"
	skillnames$(1) = "Speech"
	skillnames$(2) = "Barter"
	skillnames$(3) = "Investigation"
	skillnames$(4) = "Intelligence"


Function SkillTree () ;This is less than pratical, but it´s the best way to do it when using global vars.
	
	Print skillnames$(0)+"="+strength
	Print skillnames$(1)+"="+speech
	Print skillnames$(2)+"="+barter
	Print skillnames$(3)+"="+investigation
	Print skillnames$(4)+"="+intelligence

End Function

While KeyDown(32)

	SkillTree ()

Wend

;Perks

Global cwhiz=0,tfinger=0,extort=0,lpick=0,consul=0,sargeant=0,medium=0

;Perk list:
;Computer Whiz - Allows you to try your chance at brute-forcing computers and finding passwords without asking or looting nearby points of interest.
;Trigger Finger - Random chance that the game will tell you when someone is armed.
;Extorter - Random chance that the game will tell you that the person you are talking to is worth your time.
;Lockpicker - Allows to lockpick some doors instead of finding the key.
;Consul - Will make the player character able to translate foregein languages.
;Sargeant - You now have a better chance of talking down all Fort Carson Freedom Militia members below sargeant rank.
;Medium - You will now be able to evaluate someone´s mental and physicological state.

Function DisplayPerks ()

	If cwhiz=1 Then Print "Computer Whiz - Allows you to brute-force computers instead of having to find a password."
	If tfinger=1 Then Print "Trigger Finger - Sometimes, the game may tell you when someone is armed."
	If extort=1 Then Print "Extorter - The game may sometimes tell you if the person you´re talking to holds any important information."
	If consul=1 Then Print "Consul - Will allow you to translate things foregein characters say."
	If lpick=1 Then Print "Lockpicker - Allows you to try your chance at lockpicking doors instead of finding keys."
	If sargeant=1 Then Print "Sargeant - You now have a better chance at talking down all FCFM members below Sgt. rank."
	If medium=1
		Print "Medium - You are now able to evaluate someone´s mental and physicological state."
		
		Else

			Print "You do not have any traits."

	EndIf

End Function

While KeyDown(33)
	
	DisplayPerks ()

We
Global p_status1=0, p_status3=0,p_status4=0,p_status5=0 ; 1 - Hands Bound, 2 - Crippled (Doesen´t exist anymore, check p_body.bb), 3 - Blindfolded, 4 - On the ground, 5 - Falling.
;The way to do statuses presented above is not the most practical by far, they could be compressed into just one global variable, but in case
;we ever need things like effect stacking, it will allow us to do so with fewer lines, the "crippled" status is used for streamlining so we don´t
;need to specify which limb is crippled for actions that require them all, like climbinh
;p_body renamed to health.bb