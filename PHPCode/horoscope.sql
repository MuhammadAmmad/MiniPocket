-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 17, 2017 at 06:35 अपराह्न
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `horoscope`
--

-- --------------------------------------------------------

--
-- Table structure for table `Horoscope`
--

CREATE TABLE `Horoscope` (
  `Id` varchar(5) NOT NULL,
  `Yesterday` varchar(500) NOT NULL,
  `Today` varchar(500) NOT NULL,
  `Tomorrow` varchar(500) NOT NULL,
  `This_Week` varchar(500) NOT NULL,
  `This_Month` varchar(600) NOT NULL,
  `This_Year` varchar(2000) NOT NULL,
  `Week_Date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Horoscope`
--

INSERT INTO `Horoscope` (`Id`, `Yesterday`, `Today`, `Tomorrow`, `This_Week`, `This_Month`, `This_Year`, `Week_Date`) VALUES
('1', 'Attempts to attend a festival, party, or other group activity could be hampered by minor obstacles like traffic jams, forgetting things, and getting lost, Libra. This can be frustrating and irritating, but don''t let it stop you. It''s important to be out with your friends today. Fill up the car, get a good map, and make your way to the place by the side streets. Have some fun!', 'Today you might decide to sign up for an advanced course of some kind, Libra. This might include world religions or perhaps meditation. Stay out of bookstores, both physical and online. You might spend a fortune on books on your chosen subject. The effect of this is likely to be more profound than a simple accumulation of knowledge. Prepare to be transformed.', 'This is likely a day when you want to reflect on your successes. As your professional success continues to skyrocket, your sense of self-confidence follows suit. So do your relationships with family, friends, children, and romantic partners. Your mind is especially sharp, Libra, and your personal innovations should continue to progress. Life is good and likely to stay that way for a while.', 'With the Sun now in a more dynamic sector of your chart, this is your opportunity to showcase skills and talents that could get you noticed by the right people. It certainly isn''t the time to hide your light or be modest about anything you''re good at. Take every opportunity to showcase your goods or services so others can appreciate how amazing you are. Don''t forget to dress the part, too, as this can also influence others to engage with you.', 'The January 12 Full Moon could find you getting emotional about a work or career matter. You could put in a few extra hours or make some other personal sacrifice, like agreeing to a short business trip. Or you might give a presentation on short notice. Feel lucky in love on January 18 when the Moon conjoins Jupiter in Libra. Any feelings of loneliness dissolve into thin air. For the New Moon on January 27, have more fun just eavesdropping and listening to others enjoy themselves. Feel a part of a bigger group without doing anything more than showing up and being there. ', 'For the first ten months of 2017, enthusiatic and big-hearted Jupiter is in your sign, Libra. You can do endless good things with this. Strong allies, partners, and friends are there with you. Have a persistent vision, help and be helpful, and you should have a magnificent year!\r\n\r\nVenus and the Moon are conjoined in the Air Sign Aquarius as 2017 begins. Love and all social relationships and connections will benefit from the cool, clear-seeing, but compassionate influences of this Air Sign.\r\n\r\nJupiter is retrograde from February through early June, giving you extra time to make the most of all the good things that Jupiter can bring. This retrograde doesn''t take luck away but it concentrates on internal, less obvious issues. Be luckier in personal matters and get into better shape by the summer.\r\n\r\nAs the Sun enters Libra, Mercury, Venus, and Mars are all in sensible, accomplished Virgo. Your efforts may sometimes feel modest but they will have great influence and consequences.\r\n\r\nThe Sun is also conjoined with the asteroid Vesta. You natually sacrifice and share blessings and good luck. The Moon is in a separating conjunction with Jupiter at the same time. Feelings and intentions deepen and you''ll focus more sharply on what matters most to you. ', 'From JANUARY 23, 2017 to JANUARY 29, 2017'),
('Aries', 'An upsetting dream about someone you love deeply could cause you to awaken suddenly in the night, Aries. You might have to ground yourself a little in reality before trying to go back to sleep. Stay calm. The dream isn''t prophetic. It probably relates to your own fears about this person, or maybe even about yourself. Wait until morning and write down the dream. The meaning should clarify by then. ', 'Today you could experience a strong desire to clear your psyche of past traumas that limit you, Aries. You may decide to register for a seminar or workshop of some kind. If you sign up today, all signs are that you will not only attain the results you want but you will also meet some interesting new people. Among them could be a potential love partner. Go for it, and have fun. ', 'The company of good friends, perhaps at a group activity or festival of some kind, contributes to a powerful feeling of good health, good fortune, and happiness, Aries. You will probably want to spend a lot of time outdoors today. Sports might appeal to you. There will be a few minor accidents - dropping things, spilling drinks - but in all, this should be a satisfying day. ', 'You may have felt somewhat lackluster in recent weeks, with your focus more inward than usual. This phase may also have coincided with opportunities to clear away emotional baggage and deal with complex issues that needed time and space to resolve. However, as Mars, your personal planet, strides into your sign on Friday, you may begin to feel much more energized and determined. The New Moon could bring a call to move in new circles, paving the way for fresh opportunities. ', 'The Moon/Uranus conjunction on January 5 injects fresh energy into a sagging spirit if you''re suffering from a bout of holiday burnout. The January 12 Full Moon shines straight into your home and family life. You may think that a work concern is more important. Important? Yes. More? No. Do what''s necessary and then get back to being happy at home. Social life expands and blooms with the New Moon on January 27. You could make several new casual friends who introduce you to a much wider social circle. You aren''t obliged to let it eat your life, though, or last forever.', 'You''ve got charm, smarts, and the element of surprise going for you all year long! Now what do you want to do with all these cosmic gifts? Tip: let them take you in a brand new direction.\r\n\r\nSaturn and Uranus are trine most of the year, meaning that you may just continue with what''s been working well. However, as the year progresses, boredom and ambition may both grow. By December you may have positioned yourself to make a big move to begin something radically different.\r\n\r\nVenus is retrograde this year, partially in Aries. This provides you with more time to socially regroup and to appeal to people''s emotional needs.\r\n\r\nA Mercury retrograde in April concludes in early May in your sign, Aries. Emotionally size up how things are going for you during the retrograde. By early May you should have a game plan that lets you make faster progress in a career or a relationship.\r\n\r\nYour planet Mars is extremely active and you should have the health and energy to be busy every single day. Not a bad thing!', 'From JANUARY 23, 2017 to JANUARY 29, 2017'),
('Tauru', 'A misunderstanding with a family member or partner could mar your morning, Taurus. One of you is less communicative than usual. It might take some effort to bring the issues into the open and work them out. They probably seem more serious than they are. Both you and the other person are apt to be stressed out and a little on edge. Cut yourselves some slack. ', 'Love, passion, romance, and marriage - your mind will focus on these matters all day even if there''s no special person in your life right now, Taurus. If you are involved, don''t be surprised if talk of a long-term commitment creeps into your conversations with your beloved. If you aren''t involved, someone new and exciting could appear on the scene. When you go out, make sure you look your best. ', 'Continued success and good fortune regarding finances could have you flying high right now, Taurus. You''re probably glowing with self-confidence and may well be surrounded by good friends. There might even be some public acclaim. A few minor mishaps might occur today, but they certainly won''t put a damper on the mood. Expect to have a wonderful day! ', 'As Venus continues its journey through your social sector, this first month of 2017 may be a leading one for making new friends and acquaintances. Whether you want to have more fun, find love, or network for other reasons, it''s likely been a very productive time. Things could change from this Friday, though, as Mars enters a quieter sector of your chart. Here, it could stir up your psyche and empower you to let go of any issues holding you back. ', 'During the intense Sun/Pluto conjunction of January 6, the Moon is in unflappable Taurus. No matter what the world tosses at you, you can make it something beautiful. On the January 12 Full Moon, nothing is better than being with special friends. You may be willing to pitch in more than your share, but they won''t let you get away with that. The New Moon on January 27 ignites your career and work situation. A door could open to admit you to a big, new, exciting project. Or you might be cast into a prominent position on a project that lets you strut your best stuff. ', 'This year, focus on your own well-being above all else. You can increase your material wealth and health this way, and also structure a more stable future. With Mars and the asteroid Ceres starting the year in your sign, you have the energy to nurture and grow the future you want.\r\n\r\nThe Sun-Pluto conjunction in early January is in the Cardinal Earth Sign Capricorn. Cardinal Signs love to start things, and Earth Signs (such as Taurus and Capricorn) are totally practical and realistic. This conjunction is a signal to make a big change or to formulate an ambitious new plan to make 2017 better than ever.\r\n\r\nYour planet Venus is retrograde this year. Which things and people make you happiest? When this retrograde ends, you may want time to let your feelings settle down to focus on what really matters.\r\n\r\nOf Mercury''s four retrogrades, the second one starts in Taurus. Rethink any previous decisions and find improvements during this one (in April).\r\n\r\nSpring may be complicated, but autumn gets simpler and more serious when Jupiter moves into Scorpio in October. December is a powerhouse for all Earth Signs as Saturn goes home into Capricorn. Changes are everywhere!', 'From JANUARY 23, 2017 to JANUARY 29, 2017');

-- --------------------------------------------------------

--
-- Table structure for table `unit`
--

CREATE TABLE `unit` (
  `Id` varchar(5) NOT NULL,
  `Usd_Dollar` varchar(10) NOT NULL,
  `Aus_Dollar` varchar(10) NOT NULL,
  `Indian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `unit`
--

INSERT INTO `unit` (`Id`, `Usd_Dollar`, `Aus_Dollar`, `Indian`) VALUES
('1', '100', '89', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Horoscope`
--
ALTER TABLE `Horoscope`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `unit`
--
ALTER TABLE `unit`
  ADD PRIMARY KEY (`Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
