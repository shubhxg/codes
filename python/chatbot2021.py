import os
import pyttsx3
print("\n\nTHIS CHAT BOT CAN HELP YOU OPEN BASIC APPLICATIONS\nFor ex: 'open instagram' or 'start firefox'\n'Stop or Exit to exit the chatbot'")
while True:
    _choice = input("\nHey, What can i do for you ? : ")
   #code to change the voice of the pyttsx3
    engine = pyttsx3.init()
    voices = engine.getProperty('voices')
    engine.setProperty('voice', voices[1].id)

    #chrome done
    if (("open" or "load" or "run" or "execute" or "start" or "exec" in _choice) and ("chrome" in _choice)):
        print("OK")
        pyttsx3.speak("OK")
        os.system("start chrome")

    #firefox done
    elif ("open" in _choice or "load" in _choice or "start" in _choice or "execute" in _choice) and ("firefox" in _choice):
        print("Sure opening firefox browser")
        pyttsx3.speak("Sure, opening firefox browser")
        os.system('start firefox')

    #google done
    elif (("search" in _choice or "open" in _choice or "load" in _choice or "start" in _choice) and ("google.com" in _choice)):
        pyttsx3.speak("Sure, opening google.com")
        os.system("start chrome google.com")
        print ("Sure, opening google.com")
            
    #gmail done
    elif ("search" in _choice or "load" in _choice or "start" in _choice or "open" in _choice) and ("gmail" in _choice or "gmail.com" in _choice):
        pyttsx3.speak("Sure! In which browser you want me to open the gmail ?")
        gm = input("Sure, In which browser you want me to open the gmail? : ")
        if gm == ("chrome" or "google chrome browser" or "chrome browser"):
            print("Sure opening gmail...")
            pyttsx3.speak("Sure! opening gmail.com")
            os.system("start chrome  gmail.com")
            pyttsx3.speak("Anything else i can do for you let me know.")
        elif gm == ("firefox" or "firefox browser"):
            print("Sure opening gmail.com")
            pyttsx3.speak("Sure! opening gmail.com")
            os.system("start firefox  gmail.com")
        else:
            print("i dont understand...")
            pyttsx3.speak("i dont understand")
        
    #facebook done
    elif (("search" in _choice)  or ("open" in _choice) or ("start" in _choice)) and (("facebook" in _choice) or ("facebook.com" in _choice)):
        pyttsx3.speak("Sure, In which browser you want to open the Facebook? : ")
        com_facebook = input("Sure, In which browser you want to open the Facebook? : ")
        if com_facebook == "chrome":
            pyttsx3.speak("Sure, opening facebook.com")
            os.system("start chrome  facebook.com")
            print("Sure opening facebook.com")
        elif com_facebook == "firefox":
            pyttsx3.speak("Sure, opening facebook.com")
            os.system("start firefox  facebook.com")
            print("Sure opening instagram...")
        else:
            print("i dont understand.")
            pyttsx3.speak("i dont understand.")

     #instagram done
    elif (("search" in _choice or "open" in _choice or "start" in _choice) and ("instagram.com" in _choice or "instagram" in _choice)):
        pyttsx3.speak("Sure! In which browser you want me to open the Insta gram ?")
        ins = input("Sure, In which browser you want me to open the Instagram ? : ")
        if ins == "chrome":
            pyttsx3.speak("Sure! opening Insta gram")
            print("Sure opening instagram...")
            os.system("start chrome  instagram.com")
        elif ins == "firefox":
            pyttsx3.speak("Sure! opening insta gram")
            print("Sure opening instagram...")
        else :
            print("i dont understand...")
            pyttsx3.speak("i dont understand")

    #twitter done
    elif (("search" in _choice)  or ("open" in _choice) or ("start" in _choice)) and (("twitter" in _choice) or ("twitter.com" in _choice)):
        pyttsx3.speak("Sure! In which browser you want me to open the twitter.com ?")
        twit = input("Sure, In which browser you want to open the Twitter? : ")
        if twit == "chrome":
            pyttsx3.speak("Sure, opening twitter.com")
            os.system("start chrome  twitter.com")
            print("Sure opening twitter...")
        elif twit == "firefox": 
            pyttsx3.speak("Sure, opening twitter.com")
            os.system("start firefox  twitter.com")
            print("Sure opening twitter...")
        else:
            print("i dont understand.")
            pyttsx3.speak("i dont understand.")

    #reddit done
    elif (("search" in _choice)  or ("open" in _choice) or ("start" in _choice)) and (("reddit" in _choice) or ("reddit.com" in _choice)):
        pyttsx3.speak("Sure, In which browser you want me to open reddit")
        com_reddit = input("Sure, In which browser you want me to open the Reddit? : ")
        if com_reddit == "chrome":
            pyttsx3.speak("Sure, opening reddit")
            os.system("start chrome  reddit.com")
            print("Sure opening reddit...")
        elif com_reddit == "firefox":
            pyttsx3.speak("Sure, opening reddit")
            os.system("start firefox  reddit.com")
            print("Sure opening reddit...")
        else:
            print("i dont understand.")
            pyttsx3.speak("i dont understand.")

    #youtube done
    elif (("search" in _choice)  or ("open" in _choice) or ("start" in _choice)) and (("youtube" in _choice) or ("youtube.com" in _choice)):
        pyttsx3.speak("Sure, In which browser you want me to open youtube")
        com_yt = input("Sure, In which browser you want me to open the youtube? : ")
        if com_yt == "chrome":
            pyttsx3.speak("Sure, opening youtube")
            os.system("start chrome  youtube.com")
            print("Sure opening youtube...")
        elif com_yt == "firefox":
            pyttsx3.speak("Sure, opening youtube")
            os.system("start firefox  youtube.com")
            print("Sure opening youtube...")
        else:
            print("i dont understand.")
            pyttsx3.speak("i dont understand.")

    #notepad done
    elif (("open" in _choice)  or ("run" in _choice) or ("start" in _choice)) and (("notepad" in _choice) or ("editor" in _choice)):
        pyttsx3.speak("Sure, opening notepad")
        print("Sure, opening notepad")
        os.system("start notepad")

    #windows media player done
    elif("open" in _choice or "load" in _choice or "start" in _choice) and ("wmplayer" in _choice or "windows media player" in _choice or "musicplayer" in _choice or "start music player" in _choice):
        print("Sure, opening windows media player")
        pyttsx3.speak("Sure, opening windows media player")
        os.system("start wmplayer")

    #control panel done
    elif (("open" in _choice or "load" in _choice or "start" in _choice) and ("control panel" in _choice or "settings" in _choice)):
        print("Sure, opening control panel.")
        pyttsx3.speak("Sure, opening control panel.")
        os.system("start control panel")

    #some easter eggs done
    elif ("fire" in _choice):
        pyttsx3.speak("Do you want me to open firefox ?")
        com_fire = input("Do you want me to open Firefox? : ")
        if (com_fire == 'yes'):
            print("OK")
            pyttsx3.speak("OK")
            os.system("start firefox")
            pyttsx3.speak("Anything else i can do for you let me know.")
        else:
            print("OK!, Sorry")
            pyttsx3.speak("OK, Sorry")
    elif (("i" in _choice and "am feeling" in _choice) and ("sad" in _choice)):
        print("\nDont be sad,")
        pyttsx3.speak("Dont be sad,")
        print("Everything will be fine")
        pyttsx3.speak("everything will be fine.")
        print("Let me play some funny videos for you to watch")
        pyttsx3.speak("Let me play some funny videos for you to watch")
        os.system("start chrome https://www.youtube.com/watch?v=GG5DX9VVqgE")
        pyttsx3.speak("here you go, thank me later")

    elif (("i" in _choice and "am feeling" in _choice) and ("happy" in _choice or "great" in _choice)):
        print("\nThats great, i am happy to hear that :D")
        pyttsx3.speak("Thats great, i am happy to hear that")
        print("Here is a song i want you to listen, it will make you feel energetic")
        pyttsx3.speak("Here is a song i want you to listen, it will make you feel energetic")
        os.system("start chrome https://www.youtube.com/watch?v=j8GSRFS-8tc")
        pyttsx3.speak("enjoy+++")
    elif ("hello" in _choice or "hi" in _choice):
        print("Hello, Dear User, I am your personal 'chatbot', Chat with me and tell me what to do for you :D")
        pyttsx3.speak("Hello, Dear User, I am your personal 'chatbot', Chat with me, and tell me what can i do for you")
    elif ("namastey" in _choice):
        print("Namastey :D, Dear User, I am your personal 'chatbot', Chat with me and tell me what to do for you :)")
        pyttsx3.speak("Namas tey, Dear User, I am your personal 'chatbot', Chat with me, and tell me what can i do for you")
    elif ("thanks" in _choice or "thank you" in _choice or "thankyou" in _choice):
        print("Your Welcome")
        pyttsx3.speak("Your Welcome, My friend")

    #exit done
    elif ("close" in _choice or "exit" in _choice or "stop" in _choice or "bye" in _choice):
        print("Sure!, Thank you for using chatbot :D")
        pyttsx3.speak("Sure, Thank you for using chatbot")
        print("\nPROGRAM CREATED BY\n  SHUBH SHARMA")
        pyttsx3.speak("This program was created by, Shubh Sharma, dont forget to follow him on insta gram and github")
        break
    #confused done
    else:
        print("I am not sure what you are talking about, can u please be little specific :(")
        pyttsx3.speak("ummm not sure what you are talking about, can u please be little specific")
