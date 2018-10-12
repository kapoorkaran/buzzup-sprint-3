package com.stackroute.buzzup.distributor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.stackroute.buzzup.distributor.domain.Movie;
import com.stackroute.buzzup.distributor.repository.MovieRepositary;



@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private MovieRepositary movieRepositary;

	public DataLoader(MovieRepositary movieRepository) {
		this.movieRepositary = movieRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		movieRepositary.save(new Movie("1", "Rockstar",
				"https://repos.hungama.com/audio/display%20image/300x300%20jpeg/5992620.jpg", "Ranbir Kapoor",
				"Imtiaz Ali", "Nargis Fakhri", "Drama",
				"Rockstar is a 2011 Indian musical romantic drama film directed by Imtiaz Ali, starring Ranbir Kapoor and Nargis Fakhri, with music composed by A. R. Rahman. The film also stars Moufid Aziz, Aditi Rao Hydari, Piyush Mishra, Shernaz Patel, Kumud Mishra in supporting roles, and also Shammi Kapoor, who makes his last silver screen appearance. The film was produced by Eros International Ltd. along with Shree Ashtavinayak Cine Vision Ltd. It follows Janardhan Jakhar a.k.a. JJ or Jordan, who dreams of becoming a rockstar like his role model, Jim Morrison. Yet, eventually on attaining all that he dreamt of, Jordan ends up anguished and despondent, by the loss of Heer Kaul, whom he loved passionately and whose death is inadvertently caused by Jordan himself",
				"2D", "hindi", "02:13", "02-03-1996"));
		
		movieRepositary.save(new Movie("2", "Sivaji",
				"https://upload.wikimedia.org/wikipedia/en/c/ce/Sivaji_The_Boss.jpg", "Rajnikanth",
				"S.Shankar", "Shriya Saran", "Drama",
				"Rockstar is a 2011 Indian musical romantic drama film directed by Imtiaz Ali, starring Ranbir Kapoor and Nargis Fakhri, with music composed by A. R. Rahman. The film also stars Moufid Aziz, Aditi Rao Hydari, Piyush Mishra, Shernaz Patel, Kumud Mishra in supporting roles, and also Shammi Kapoor, who makes his last silver screen appearance. The film was produced by Eros International Ltd. along with Shree Ashtavinayak Cine Vision Ltd. It follows Janardhan Jakhar a.k.a. JJ or Jordan, who dreams of becoming a rockstar like his role model, Jim Morrison. Yet, eventually on attaining all that he dreamt of, Jordan ends up anguished and despondent, by the loss of Heer Kaul, whom he loved passionately and whose death is inadvertently caused by Jordan himself",
				"2D", "hindi", "02:13", "02-03-1996"));


		movieRepositary.save(new Movie("21", "Venom",
               "https://i0.wp.com/lh3.googleusercontent.com/7-CVRM2okJBXY6KCdzXuPDkIu4XraNEClpLbDxRqyrXCwO7EO4OIUMqqiXx7TclUIOk=w300", "Tom Hardy","Ruben Fleischer",
               "Michelle Williams", "Comics ","Venom is a 2018 American superhero film based on the Marvel Comics character of the same name, produced by Columbia Pictures in association with Marvel.[5] Distributed by Sony Pictures Releasing, it is the first film in Sony's Marvel Universe. The film is directed by Ruben Fleischer from a screenplay by Jeff Pinkner, Scott Rosenberg, and Kelly Marcel, and stars Tom Hardy as Eddie Brock / Venom, alongside Michelle Williams, Riz Ahmed, Scott Haze, and Reid Scott. In Venom, journalist Brock gains superpowers after being bound to an alien symbiote whose species plans to invade Earth.",
               "3D", "English", "02:02", "01-10-2018"));

movieRepositary.save(new Movie("22", "Johnny English Strikes Again",
               "http://buzinessbytes.com/wp-content/uploads/2018/09/JE3_1SHT_ROWAN_OLGA_R4-page-001-300x300.jpg","Rowan Atkinson","David Kerr","Ben Miller", "Comedy",
               "Johnny English Strikes Again is a 2018 action comedy[3] film directed by David Kerr; it is a sequel to the 2011 film Johnny English Reborn and the third instalment in the Johnny English series. The film is written by William Davies and produced by Rowan Atkinson, who reprises his role as the title character. The film will be released in cinemas in the United Kingdom on 5 October 2018 and 26 October in the United States, by Universal Pictures.",
               "2D", "English", "01:44", "05-10-2018"));

movieRepositary.save(new Movie("23", "Race 3",
               "https://www.lyricstake.com/wp-content/uploads/2018/05/Allah-Duhai-Hai-Lyrics-Race-3-300x300.jpg","Salman Khan","Remo D'Souza","Jacqueline Fernandez", "Thriller",
               "Race 3 is a 2018 Indian action thriller film directed by Remo D'Souza and produced under Tips Films and Salman Khan Films. The film features Anil Kapoor, Salman Khan, Bobby Deol, Jacqueline Fernandez, Daisy Shah, Saqib Saleem and Freddy Daruwala. It is the third installment of Race film franchise and the sequel of Race (2008) and Race 2 (2013). it has a sparsely related plot to previous films of the franchise. The film released on 15 June 2018 coinciding with Eid.",
               "2D", "Hindi", "02:44", "15-06-2018"));

movieRepositary.save(new Movie("24", "Stree",
               "http://content.hungama.com/audio%20album/display%20image/300x300%20jpeg/5239452731.jpg",
    
"Rajkummar Rao","Amar Kaushik","Shraddha Kapoor", "Horror",
               "Stree (transl. Woman;) is a 2018 Indian Hindi-language comedy horror film that went on to become one of the biggest blockbusters of all time. The film is directed by Amar Kaushik, written by Raj Nidimoru and Krishna D.K. and produced by Dinesh Vijan and Raj Nidimoru and Krishna D.K. under the banner of Maddock Films in association with D2RFilms. It is based on the Indian urban legend Nale Ba, about a spirit who knocks on people's doors at night. Stree stars Rajkummar Rao and Shraddha Kapoor. Pankaj Tripathi, Aparshakti Khurrana, and Abhishek Banerjee appear in supporting roles.",
               "2D", "Hindi", "02:09", "30-08-2018"));

movieRepositary.save(new Movie("25", "Sanju",
               "https://1.bp.blogspot.com/--Rvh-QJBTsE/W0gNBKfJULI/AAAAAAAAADE/2uAD9QV6uAcX1POpTWyQCNYxfhCebioIACLcBGAs/s300-c/Sanju-2018.jpg",
    
"Ranbir Kapoor","Rajkumar Hirani","Vicky Kaushal", "Drama",
               "Sanju is a 2018 Indian biographical film directed by Rajkumar Hirani and written by Hirani and Abhijat Joshi. It was jointly produced by Hirani and Vidhu Vinod Chopra under the banners Rajkumar Hirani Films and Vinod Chopra Films respectively. The film follows the life of Bollywood actor Sanjay Dutt, his addiction with drugs, arrest for alleged association with the 1993 Bombay bombings, relationship with his father, comeback in the industry, the eventual drop of charges from bombay blasts, and release after completing his jail term. Ranbir Kapoor stars as Dutt, along with an ensemble cast which features Paresh Rawal as Sunil Dutt, Vicky Kaushal, Manisha Koirala as Nargis, Dia Mirza as Manyata Dutt, Sonam Kapoor, Anushka Sharma and Jim Sarbh.",
               "2D", "Hindi", "02:41", "29-06-2018"));

movieRepositary.save(new Movie("27", "Kaala",
               "https://i9.behindwoods.com/tamil-movies-cinema-news-16/images/superstar-rajinikanths-kaala-official-telugu-songs-jukebox-new-home-mob-index.jpg",
   "Rajinikanth","Pa Ranjith","Nana Patekar", "Action","Kaala is a 2018 Indian Tamil-language sociopolitical action drama film written and directed by Pa. Ranjith and produced by Dhanush. Starring Rajinikanth in the lead role,the film was announced in 2016. The film was earlier scheduled to be released on 27 April 2018 but was postponed to June due to the standoff between Nadigar Sangam and Digital Service Providers on the increase of Virtual Print Fee charges along with the 2018 Tamil Nadu protests for Kaveri water sharing issue which also led to the delay in release of other Tamil films. Kaala premiered in Malaysia on 6 June 2018, followed by a release in 1,800 theatres in India on 7 June 2018.",
               "2D", "Tamil", "02:39", "07-06-2018"));

movieRepositary.save(new Movie("28", "Tamizh Padam 2",
               "http://www.tamilmediahouse.com/flcimgs/news-images/tamizh-padam-2-trolls-actors-rajinikanth-and-vishal.jpg",
    "Shiva","C. S. Amudhan","Iswarya Menon", "Parody",
               "Tamizh Padam 2 (Tamil Film 2) is a 2018 Indian Tamil language parody film, written and directed by C. S. Amudhan, and produced by S. Sashikanth. A sequel to Thamizh Padam (2010), the film stars Shiva and Disha Pandey, with music composed by Kannan and cinematography by Gopi Amarnath.",
               "2D", "Tamil", "02:25", "12-07-2018"));

movieRepositary.save(new Movie("29", "Chak De India",
        "https://images-na.ssl-images-amazon.com/images/I/51yrR0KB2UL._SY300_QL70_.jpg","Shah Rukh Khan","Shimit Amin" ,"Sagarika Ghatge" ,"Sports",
        "Chak De! India (English: Go For it! India or Go! India) is a 2007 Indian sports film, directed by Shimit Amin and produced by Aditya Chopra, with a screenplay written by Jaideep Sahni, sports scenes choreographed by Rob Miller, and music by Salim–Sulaiman. It tells a fictional story about the Indian women's national field-hockey team, which was inspired by the team's win at the 2002 Commonwealth Games, and explores themes such as feminism and sexism, the legacy of the partition of India, racial and religious bigotry, and ethnic and regional prejudice. The film stars Shahrukh Khan as Kabir Khan, former captain of the Indian men's national field-hockey team. After a disastrous loss to Pakistan, Khan is ostracized from the sport and he and his mother are driven from the family home by angry neighbors. Seven years later, to redeem himself, Khan becomes the coach of the Indian national women's hockey team and aims to turn its sixteen contentious players into a championship unit.",
        "2D", "Hindi", "02:33:21", "10-08-2007"));
movieRepositary.save(new Movie("30", "Sairat",
        "https://images-na.ssl-images-amazon.com/images/I/61FEYqBJ3IL._SY300_QL70_.jpg",
"Rinku Rajguru","Nagraj Manjule","Akash Thosar", "Romance",
        "Sairat (English: Wild) is a 2016 Indian Marathi-language romance film, directed by Nagraj Manjule and produced by himself under his banner Aatpat Production along with Essel Vision Productions and Zee Studios. Starring Rinku Rajguru and Akash Thosar in their debuts, it tells the story of two young college students from different castes who fall in love, sparking conflict between their families.",
        "2D", "Marathi", "02:56:45", "29-04-2016"));
		
		
}
}
